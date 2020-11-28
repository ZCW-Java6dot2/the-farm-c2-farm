package Vehicle;

import Interfaces.NoiseMaker;
import Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    private String noise;

    public String makeNoise() {
  return "vroom vroom";
    }
}
