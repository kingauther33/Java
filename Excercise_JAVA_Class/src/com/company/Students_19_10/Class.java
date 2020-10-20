package com.company.Students_19_10;

public class Class {
    private short classID;
    private String className;
    private String status;

    public Class(short classID, String className, String status) {
        this.classID = classID;
        this.className = className;
        if (status.toLowerCase().equals("active") || status.toLowerCase().equals("finish")){
            this.status = status;
        } else throw new IllegalArgumentException("invalid status input");
    }

    public short getClassID() {
        return classID;
    }

    public String getClassName() {
        return className;
    }

    public String getStatus() {
        return status;
    }

    public void setClassID(short classID) {
        this.classID = classID;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("Class[ClassID=%d,ClassName=%s,Status=%s]", classID, className, status);
    }

}
