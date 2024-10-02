Definition:
The Observer Pattern defines a one-to-many relationship between objects, where one object (called the subject) notifies multiple dependent objects (called observers) of any state changes. This pattern is useful when an object must notify others without knowing who those objects are.

Scenario:
In the context of a weather station broadcasting temperature updates to multiple display units (e.g., TV, phone app), this pattern ensures that whenever the weather station updates its temperature, all connected display units are automatically notified of the change.

Key Components:
Subject (WeatherStation):

Maintains a list of observers (display units) and notifies them of changes in its state.
WeatherStation stores the temperature and calls notifyObservers() when the temperature changes.
Observer (DisplayUnit):

Receives updates from the subject (weather station) and processes the information accordingly.
DisplayUnit implements the Observer interface, updating the display with the latest temperature when notified.
Advantages:
Loose Coupling: The subject only knows that it has observers, without knowing the exact class or implementation of the observers.
Scalability: Any number of observers can register with the subject, allowing for greater flexibility in the system's behavior.
Implementation Overview:
In the provided code, the WeatherStation class acts as the subject, while the DisplayUnit class acts as the observer. The weather station holds a list of all the display units (observers) that need to be updated when the temperature changes. When setTemperature() is called, it updates the temperature and notifies all the observers using the notifyObservers() method.