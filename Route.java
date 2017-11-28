package com.example.demo.RequestObject;

/**
 * Created by vananthraman on 11/20/17.
 */
public class Route {

    private int tpid;
    private int eapid;
    private String origin;
    private String destination;
    private String tripType;
    private String pathType;

    public int getTpid() {
        return tpid;
    }

    public void setTpid(int tpid) {
        this.tpid = tpid;
    }

    public int getEapid() {
        return eapid;
    }

    public void setEapid(int eapid) {
        this.eapid = eapid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;

        Route route = (Route) o;

        if (getTpid() != route.getTpid()) return false;
        if (getEapid() != route.getEapid()) return false;
        if (getOrigin() != null ? !getOrigin().equals(route.getOrigin()) : route.getOrigin() != null) return false;
        if (getDestination() != null ? !getDestination().equals(route.getDestination()) : route.getDestination() != null)
            return false;
        if (getTripType() != null ? !getTripType().equals(route.getTripType()) : route.getTripType() != null)
            return false;
        return getPathType() != null ? getPathType().equals(route.getPathType()) : route.getPathType() == null;

    }

    @Override
    public int hashCode() {
        int result = getTpid();
        result = 31 * result + getEapid();
        result = 31 * result + (getOrigin() != null ? getOrigin().hashCode() : 0);
        result = 31 * result + (getDestination() != null ? getDestination().hashCode() : 0);
        result = 31 * result + (getTripType() != null ? getTripType().hashCode() : 0);
        result = 31 * result + (getPathType() != null ? getPathType().hashCode() : 0);
        return result;
    }
}
