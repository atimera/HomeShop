package com.opc.amdiatou.homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line line to write
     */
    public void writeLine(String line);

    /**
     * stop writing process
     */
    public void stop();
}
