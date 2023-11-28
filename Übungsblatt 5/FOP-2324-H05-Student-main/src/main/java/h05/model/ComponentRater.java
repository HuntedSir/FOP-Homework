package h05.model;

public interface ComponentRater {
    void consumeMainboard(Mainboard mainboard);
    void consumeCPU(CPU cpu);
    void consumeMemory(Memory memory);
    void consumePeripheral(Peripheral peripheral);
}
