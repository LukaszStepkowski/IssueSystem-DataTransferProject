package sda.issuesystem.dto;

import java.io.Serializable;

public class DataTransferObject<T> implements Serializable {

    private final String processName;
    private final T object;

    public DataTransferObject(String processName, T object) {
        this.processName = processName;
        this.object = object;
    }

    public String getProcessName() {
        return processName;
    }

    public T getObject() {
        return object;
    }

    public static final String ADU = "ADU"; // add user
    public static final String GETU = "GETU"; // get user
    public static final String FUBL = "FUBL"; // find user by login
    public static final String DELU = "DELU"; // delete user
}
