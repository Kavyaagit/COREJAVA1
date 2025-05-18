package com.tns.day7;

public class RBI {
    public float getRateOfInterest() {
        return 7.4f;
    }
}

class SBI extends RBI {
    @Override
    public float getRateOfInterest() {
        return 8.4f;
    }
}

class HDFC extends RBI {
    @Override
    public float getRateOfInterest() {
        return 9.4f;
    }
}

class ICICI extends RBI {
    @Override
    public float getRateOfInterest() {
        return 10.0f;
    }
}