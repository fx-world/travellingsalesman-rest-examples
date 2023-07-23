# travellingsalesman-rest-examples

Examples for the travelling salesman rest api

## OpenAPI Definition

See [api.json](api.json)

## Edge Types

* DistanceMatrix
* Euclidean2D
* Euclidean3D
* Manhattan2D
* Manhattan3D
* Chebyshev2D
* Chebyshev3D

## Usage

### Java / Maven

To use the API in java, just add the maven dependency and the repository to your pom file.

	<repositories>
		<repository>
			<id>fx-world</id>
      		<name>fx-world Maven Repository</name>
      		<url>http://maven.fx-world.de</url>
    	</repository>
    </repositories>
    
	<dependencies>
		<dependency>
			<groupId>de.fx-world</groupId>
			<artifactId>de.fxworld.travellingsalesman.restclient</artifactId>
			<version>1.0.0</version>
		</dependency>
	</dependencies>

An example project can be found [here](https://github.com/fx-world/travellingsalesman-rest-examples/tree/main/tsm-java).