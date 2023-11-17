package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import server.model.distanceData.GeographicDistanceData;
import server.model.geographicData.GeographicDao;
import server.model.geographicData.GeographicData;
import server.model.travelRequest.TravelData;
import server.model.travelRequest.TravelRequestData;
import server.model.usuario.UsuarioDao;

import java.util.*;

@RestController
public class GeographicDataController {

    @Autowired
    private GeographicDao geographicDao;

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/viaje/get-best-path")//
    public TravelData getRegistrados(@RequestBody TravelRequestData myObject) {

        var usuario = usuarioDao.getUsuarioByCorreo(myObject.getCorreoUser());
        var initialUbication = usuario.getUbication();
        var finalUbication = geographicDao.getUbicadionDataById(33);

        var outputData = new TravelData();
        outputData.setNodes(new ArrayList<GeographicData>());
        GetBestPath(initialUbication, finalUbication, outputData);

        return outputData;
    }

    private void GetBestPath(GeographicData source, GeographicData destination, TravelData outputData)
    {
        Queue<GeographicData> queue = new LinkedList<>();
        Set<GeographicData> visited = new HashSet<>();
        Map<GeographicData, GeographicData> predecessorMap = new HashMap<>();
        List<GeographicData> mustVisit = new ArrayList<>();
        queue.add(source);

        Map<GeographicData, Double> distanceMap = new HashMap<>();
        Map<GeographicData, Double> timeMap = new HashMap<>();

        for (GeographicData data : geographicDao.getNodos()) {
            if (data.equals(source)) {
                distanceMap.put(data, 0.0);
                timeMap.put(data, 0.0);
                predecessorMap.put(data, null);
            } else {
                distanceMap.put(data, Double.POSITIVE_INFINITY);
                timeMap.put(data, 0.0);
                predecessorMap.put(data, null);
            }
        }

        while (!queue.isEmpty()) {
            GeographicData current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                for (GeographicDistanceData distanceData : current.getTo_destination_lines()) {
                    GeographicData neighbor = distanceData.getDestination();
                    double newDistance = distanceMap.get(current) + distanceData.getDistance();
                    double newTime = timeMap.get(current) + distanceData.getTime();
                    if (newDistance < distanceMap.get(neighbor)) {
                        distanceMap.put(neighbor, newDistance);
                        timeMap.put(neighbor, newTime);
                        predecessorMap.put(neighbor, current);
                        queue.add(neighbor);
                    }
                }
            }
        }

        System.out.println("line");


        GeographicData current = destination;

        while (current != null) {
            outputData.getNodes().add(0, current);
            current = predecessorMap.get(current);
        }

        outputData.setTime(timeMap.get(destination));
        outputData.setDistance(distanceMap.get(destination));


    }
}
