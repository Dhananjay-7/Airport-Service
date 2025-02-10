Airport Service
Overview
This service manages airport operations, including planes, runways, boarding, and luggage handling. The system provides APIs for:

Managing planes and runways
Handling luggage and luggage vans
Boarding processes
Features
Planes: Manage plane details such as model, capacity, and airline.
Runways: Track availability of runways for takeoff and landing.
Boarding: Handle boarding gates and their statuses.
Luggage Handling: Manage luggage vans and their trips for transporting luggage.
Database Design
The system consists of the following entities:

1. Plane
planeId: Unique identifier for the plane.
model: Model of the plane.
capacity: Passenger capacity.
airline: Associated airline.
2. Runway
runwayId: Unique identifier for the runway.
status: Boolean indicating availability.
3. Boarding Gate
gateId: Unique identifier for the boarding gate.
location: Physical location of the gate.
status: Availability status.
4. Flight
flightId: Unique flight identifier.
plane: Reference to the assigned plane.
runway: Assigned runway.
gate: Boarding gate.
departureTime: Scheduled departure time.
arrivalTime: Expected arrival time.
status: Current flight status.
5. Luggage
luggageId: Unique identifier for the luggage.
weight: Weight of the luggage.
passenger: Associated passenger.
flight: Assigned flight.
6. Luggage Van
vanId: Unique identifier for the luggage van.
capacity: Maximum capacity of the van.
status: Operational status.
7. Luggage Trip
Tracks the movement of luggage vans to deliver luggage.
Controllers
RunwayController: Manages runway operations.
LuggageController: Handles luggage-related operations.
BoardingController: Manages boarding operations.
Expected Implementation
Database Design: Optimized schema with indexing for efficient queries.
API Development: RESTful APIs for each service.
Design Patterns: Utilize appropriate design patterns for maintainability.
Indexing in DB: Implement indexing for high-performance queries.