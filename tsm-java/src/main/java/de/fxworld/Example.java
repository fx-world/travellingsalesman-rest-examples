package de.fxworld;

import java.util.Random;

import de.fxworld.travellingsalesman.ApiException;
import de.fxworld.travellingsalesman.api.TravellingSalesmanControllerApi;
import de.fxworld.travellingsalesman.model.*;
import de.fxworld.travellingsalesman.model.Problem.EdgeTypeEnum;

public class Example {

	public static void main(String[] args) throws ApiException {
		String rapidAPIKey = ">>>>> Enter your key here <<<<<";
		// init the api
		TravellingSalesmanControllerApi api = new TravellingSalesmanControllerApi();
		
		api.getApiClient().setBasePath("https://travelling-salesman.p.rapidapi.com");
		System.out.println(api.getApiClient().getBasePath());
		
		api.getApiClient()			
			.addDefaultHeader("content-type", "application/json")
			.addDefaultHeader("X-RapidAPI-Key", rapidAPIKey)
			.addDefaultHeader("X-RapidAPI-Host", "travelling-salesman.p.rapidapi.com");
			
		
		// create an example problem
		Problem p1 = api.exampleProblem("My Problem", "Manhattan2D", 2);
		System.out.println(p1);
		
		// create a new Problem an solve it
		Random rand = new Random();
		int pointCount = 5;
		Problem p2 = new Problem();
		p2.edgeType(EdgeTypeEnum.MANHATTAN2D);
		p2.setLocationCount(pointCount);
		
		for (int i = 0; i < pointCount; i++) {
			Location location = new Location();
			location.setX(rand.nextDouble() * 1000);
			location.setY(rand.nextDouble() * 1000);
			p2.addLocationsItem(location);
		}
		
		Solution solution = api.solve(p2);
		System.out.println(solution);
		
	}
}
