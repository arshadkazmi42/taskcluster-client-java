package org.mozilla.taskcluster.client.awsprovisioner;

import java.util.Date;

/**
 * A worker launchSpecification and required metadata
 *
 * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#
 */
public class WorkerTypeResponse {

    /**
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/availabilityZones
     */
    public AvailabilityZoneConfiguration[] availabilityZones;

    /**
     * True if this worker type is allowed on demand instances.  Currently
     * ignored
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/canUseOndemand
     */
    public boolean canUseOndemand;

    /**
     * True if this worker type is allowed spot instances.  Currently ignored
     * as all instances are Spot
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/canUseSpot
     */
    public boolean canUseSpot;

    /**
     * A string which describes what this image is for and hints on using it
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/description
     */
    public String description;

    /**
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/instanceTypes
     */
    public InstanceTypeConfiguration[] instanceTypes;

    /**
     * ISO Date string (e.g. new Date().toISOString()) which represents the time
     * when this worker type definition was last altered (inclusive of creation)
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/lastModified
     */
    public Date lastModified;

    /**
     * Launch Specification entries which are used in all regions and all instance types
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/launchSpec
     */
    public Object launchSpec;

    /**
     * Maximum number of capacity units to be provisioned.
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/maxCapacity
     */
    public int maxCapacity;

    /**
     * Maximum price we'll pay.  Like minPrice, this takes into account the
     * utility factor when figuring out what the actual SpotPrice submitted
     * to Amazon will be
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/maxPrice
     */
    public int maxPrice;

    /**
     * Minimum number of capacity units to be provisioned.  A capacity unit
     * is an abstract unit of capacity, where one capacity unit is roughly
     * one task which should be taken off the queue
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/minCapacity
     */
    public int minCapacity;

    /**
     * Minimum price to pay for an instance.  A Price is considered to be the
     * Amazon Spot Price multiplied by the utility factor of the InstantType
     * as specified in the instanceTypes list.  For example, if the minPrice
     * is set to $0.5 and the utility factor is 2, the actual minimum bid
     * used will be $0.25
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/minPrice
     */
    public int minPrice;

    /**
     * A string which identifies the owner of this worker type
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/owner
     */
    public String owner;

    /**
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/regions
     */
    public RegionConfiguration[] regions;

    /**
     * A scaling ratio of `0.2` means that the provisioner will attempt to keep
     * the number of pending tasks around 20% of the provisioned capacity.
     * This results in pending tasks waiting 20% of the average task execution
     * time before starting to run.
     * A higher scaling ratio often results in better utilization and longer
     * waiting times. For workerTypes running long tasks a short scaling ratio
     * may be preferred, but for workerTypes running quick tasks a higher scaling
     * ratio may increase utilization without major delays.
     * If using a scaling ratio of 0, the provisioner will attempt to keep the
     * capacity of pending spot requests equal to the number of pending tasks.
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/scalingRatio
     */
    public int scalingRatio;

    /**
     * Scopes to issue credentials to for all regions.  Scopes must be composed
     * of printable ASCII characters and spaces.
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/scopes
     */
    public String[] scopes;

    /**
     * Static secrets entries which are used in all regions and all instance types
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/secrets
     */
    public Object secrets;

    /**
     * UserData entries which are used in all regions and all instance types
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/userData
     */
    public Object userData;

    /**
     * The ID of the workerType
     *
     * Syntax:     ^[A-Za-z0-9+/=_-]{1,22}$
     *
     * See http://schemas.taskcluster.net/aws-provisioner/v1/get-worker-type-response.json#/properties/workerType
     */
    public String workerType;
}
