## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).




* Create Airport Service with following functionalities:
* 
* 
* planes runways boarding planesluggage (luggage van, trips to deliver luggage)
* 
* 
* I was expected to create DB design, APIs for the flow, designs patterns that can be implemented, indexing in DB


classes

plane : planeId, model , capacity , Airline 
runway : runwayId,boolean Status , 
luggage van : vanId, 
boarding gate: gateId, location,status
Flight : flightId, plane, runway , gete , departureTime, arrivalTime , status
Luggage : luggateId, weight, Passenger , Flight flight 
Luggage Van:  private String vanId;
    private double capacity;
    private VanStatus status;

    Luggae Trip: 

RunwayController 
LuggageCotroller 
boarding

