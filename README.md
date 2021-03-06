# DS18B20WiringPi
Bitbanging DS18B20 sensor through WiringPi


# Built on top of @danjperron-s:
https://github.com/danjperron/BitBangingDS18B20


I simplified it to a bare minimum. Changed it over to WiringPi and added Java Binding. Tested and working on Raspberry Pi3 and NanoPi Neo.

# Use case:

This code enables you to place DS18B20 sensor on any pin on all devices that support WiringPi.

Please notify me if you test this code on any new devices.

# Pick a Pin:
Change this value in **c_test.c** and **TempCReader.c**:
```c 
#define DS18B20_PIN_NUMBER 7 
```

# Compiling:

### NOTE: These instructions are originally for NanoPi Neo. With Oracle JDK installed.

### Just C version:

Copy test_c.c to your device and run:

`gcc -Wall -o test test_c.c -lwiringPi -lpthread`

To run use:

`./test`

### Java Version:

Copy files from java folder to your device.

To compile run:

`gcc -fPIC -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -o libds18temp.so TempCReader.c -lwiringPi -lpthread`

This will give you libds18temp.so. You can place this file in java library path or any folder just make sure to change to correct path in **TempSensorJNI.java**

After changing the path compile java file and run it.
