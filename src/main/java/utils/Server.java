package utils;

import com.google.maps.DirectionsApi;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.*;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.TravelMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Server {

    static GeoApiContext context = new GeoApiContext.Builder()
            .apiKey("AIzaSyB4tALS_YKVSDTLCpQuBw7g6iVR7UU3YkI")
            .build();

    private static GeographicLine calculateLine(GeographicPoint[] geographicPointList, int originId, int destinationId)
    {
        if(originId == -1 || destinationId == -1) return null;
        GeographicPoint origin = geographicPointList[originId];
        GeographicPoint destination = geographicPointList[destinationId];
        try {
            var req = DistanceMatrixApi.newRequest(context);
            var trix = req.origins(origin.latitude+","+origin.longitude)
                    .destinations(destination.latitude+","+destination.longitude)
                    .mode(TravelMode.DRIVING)
                    .await();
            double distanceInMetters = trix.rows[0].elements[0].distance.inMeters;
            double timeInSeconds = trix.rows[0].elements[0].duration.inSeconds;
            var line = new GeographicLine(distanceInMetters, timeInSeconds, destination.id,origin.id);
            return line;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
    public static void main(String[] args) {


        /*
        GeographicPoint[] geographicPointList = new GeographicPoint[]{
                new GeographicPoint(0, 9.864918, -83.921971, "Banco ATM"),
                new GeographicPoint(1, 9.864078, -83.922054, "Clinica Dental"),
                new GeographicPoint(2, 9.863229, -83.922160, "Taco Bell"),
                new GeographicPoint(3, 9.862382, -83.922259, "MonkeyScrubs"),
                new GeographicPoint(4, 9.861526, -83.922366, "Funeraria San Jorge"),
                new GeographicPoint(5, 9.860691, -83.9224854, "Calle 4"),

                new GeographicPoint(6, 9.864825, -83.921121, "Burger King"),
                new GeographicPoint(7, 9.863936, -83.921206, "Calle 2"),
                new GeographicPoint(8, 9.863116, -83.921318, "Instituto Jimenez"),
                new GeographicPoint(9, 9.862263, -83.921426, "Farmacia CCSS"),
                new GeographicPoint(10, 9.861405, -83.921538, "Ópticas Visión"),
                new GeographicPoint(11, 9.860573, -83.921649, "Plaza Asís"),

                new GeographicPoint(12, 9.864693, -83.920226, "Subway"),
                new GeographicPoint(13, 9.863815, -83.920370, "Ruinas"),
                new GeographicPoint(14, 9.863009, -83.920478,"Banco BAC"),
                new GeographicPoint(15, 9.862152, -83.920604,"Laboratorio Clínico"),
                new GeographicPoint(16, 9.861309, -83.920730,"Calle 0"),
                new GeographicPoint(17, 9.860433, -83.920856,"Avenida 10"),

                new GeographicPoint(18, 9.864565, -83.919397,"Cartago Centro"),
                new GeographicPoint(19, 9.863726, -83.919513,"Caja ANDE"),
                new GeographicPoint(20, 9.862900, -83.919614,"Pops"),
                new GeographicPoint(21, 9.862036, -83.919741,"Avenida 6"),
                new GeographicPoint(22, 9.861188, -83.919840,"Barber Shop"),
                new GeographicPoint(23, 9.860309, -83.919966,"Coco Catering"),

                new GeographicPoint(24, 9.864456, -83.918536,"Rosti"),
                new GeographicPoint(25, 9.863592, -83.918644,"Soda Il Fratello"),
                new GeographicPoint(26, 9.862782, -83.918744,"Psico&Yoga Centro de Salud Integral"),
                new GeographicPoint(27, 9.861924, -83.918865,"Bufete Cohghi Sanabria"),
                new GeographicPoint(28, 9.861069, -83.918989,"Panadería Bruma"),

                new GeographicPoint(29, 9.864321, -83.917638,"CoopeAnde"),
                new GeographicPoint(30, 9.863467, -83.917733,"Café T'Ando"),
                new GeographicPoint(31, 9.862657, -83.917827,"La canela"),
                new GeographicPoint(32, 9.861787, -83.917926,"CredeCoop R.L."),
                new GeographicPoint(33, 9.860924, -83.918031,"OFICSEVI"),
                new GeographicPoint(34, 9.860024, -83.918126,"Pizzeria Villa Italia"),

                new GeographicPoint(35, 9.864167, -83.916575,"Bakery Esau"),
                new GeographicPoint(36, 9.863346, -83.916683,"Hodgson's"),
                new GeographicPoint(37, 9.862493, -83.916824,"Transtusa"),
                new GeographicPoint(38, 9.861650, -83.916913,"Sara Studio"),
                new GeographicPoint(39, 9.860803, -83.917055,"Pollos Bro's"),
                new GeographicPoint(40, 9.859879, -83.917185,"Bar La Nave"),

                new GeographicPoint(41, 9.861511, -83.916011,"Boutique Café"),
                new GeographicPoint(42, 9.860663, -83.916156,"Antiguo Matadero"),
                new GeographicPoint(43, 9.859744, -83.916319,"Panadería Su"),

                new GeographicPoint(44, 9.864031, -83.915290,"CoopeMep"),
                new GeographicPoint(45, 9.863127, -83.915428,"CAFLIFE"),
                new GeographicPoint(46, 9.862313, -83.915518,"Grupo Decobaño"),
                new GeographicPoint(47, 9.861462, -83.915646,"Clínica Dental OdontoIntegral"),
                new GeographicPoint(48, 9.860622, -83.915719,"GVI"),
                new GeographicPoint(49, 9.859676, -83.915746,"Plaza la soledad")};

        for(var geographicPoint : geographicPointList)
        {
            System.out.println(geographicPoint);
        }


        List<GeographicLine> lines = new ArrayList<>();
        int[][] matrizRelaciones = {
                {0, 6, 12, 18, 24, 29, 35, -1, 44},
                {1, 7, 13, 19, 25, 30, 36, -1, 45},
                {2, 8, 14, 20, 26, 31, 37, -1, 46},
                {3, 9, 15, 21, 27, 32, 38, 41, 47},
                {4, 10, 16, 22, 28, 33, 39, 42, 48},
                {5, 11, 17, 23, -1, 34, 40, 43, 49}
        };

        for (int i = 0; i<6; i++)
        {
            for(int j = 0; j<9; j++)
            {
                int idOrigin = matrizRelaciones[i][j];

                if(i+1<6)
                {
                    var line = calculateLine(geographicPointList, idOrigin, matrizRelaciones[i+1][j]);
                    if(line != null)
                        lines.add(line);
                }

                if(i-1>=0)
                {
                    var line = calculateLine(geographicPointList, idOrigin, matrizRelaciones[i-1][j]);
                    if(line != null)
                        lines.add(line);
                }

                if(j+1<9)
                {
                    var line = calculateLine(geographicPointList, idOrigin, matrizRelaciones[i][j+1]);
                    if(line != null)
                        lines.add(line);
                }

                if(j-1>=0)
                {
                    var line = calculateLine(geographicPointList, idOrigin, matrizRelaciones[i][j-1]);
                    if(line != null)
                        lines.add(line);
                }
            }
        }

        for(var line : lines)
        {
            System.out.println(line);
        }


*/


        /*Graph map = new Graph();                                                       //crea mapa
        int mapSize = 40;                                                              //cantidad de destinos

        for(int i = 1; i <= mapSize; i++) { map.addVertex(i); }                        //loop para agregar vertices

        for(int i = 1; i <= (mapSize * 3); i++) {                                      //loop para agregar aristas

            int temp = i % mapSize;                                                    //valor valido dentro de mapSize

            int randDestination = (int) Math.floor((Math.random() * mapSize) + 1);     //escoge destino aleatorio
            int randWeight = (int) Math.floor((Math.random() * 10) + 1);               //escoge tiempo aleatorio

            if(temp == randDestination) { i--; }                                       //check para evitar lazos

            else if(temp != 0) { map.addEdge(temp, randDestination, randWeight); }     //agrega arista

            else { map.addEdge(mapSize, randDestination, randWeight); }                //agrega arista

        }

        map.printGraph();                                                              //imprime mapa, borrar mas tarde

        
        //valores temporales
        int start = 20;                                                                //obtiene vertice inicial
        int end = 21;                                                                  //obtiene vertice final

        Map<String, Map<Integer, Integer>> dijkstraSP = map.DijkstraSP(start, end);
        Map<Integer, Integer> previous = dijkstraSP.get("previous");
        Map<Integer, Integer> distances = dijkstraSP.get("distance");

        List<Integer> shortestPath = map.getShortestPath(start, end, previous);        //vertices de la ruta mas corta
        System.out.println("El camino mas corto es: " + shortestPath);

        int ETA = distances.get(end);                                                  //tiempo de llegada

        if(ETA >= 999999) { System.out.println("No existen rutas"); }                  //caso sin rutas disponibles

        else { System.out.println("ETA: " + ETA + "s"); }
        */

        
    }


}



/*

        Check si hay gente en el camino:

        if(shortestPath.contains(x)) {
            System.out.println("ok");
        }
        
*/
