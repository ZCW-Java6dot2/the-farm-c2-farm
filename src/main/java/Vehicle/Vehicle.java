package Vehicle;

import Interfaces.NoiseMaker;
import Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    public String makeNoise() {
  return "vroom vroom";
    }
}
