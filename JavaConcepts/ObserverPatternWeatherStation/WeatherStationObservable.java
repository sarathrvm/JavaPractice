package ObserverPatternWeatherStation;

import java.util.List;

public interface WeatherStationObservable {

   void addObserver(DeviceObserver deviceObserver);
   void removeObserver(DeviceObserver deviceObserver);



}
