package ch.sebooom.domain.trackingObject.repository;

import ch.sebooom.domain.trackingObject.TrackingObject;

import java.util.List;

/**
 * Created by seb on 12.10.16.
 */
public interface TrackingObjectRepository {

    public List<TrackingObject> getTrackingObjectAsList();
}
