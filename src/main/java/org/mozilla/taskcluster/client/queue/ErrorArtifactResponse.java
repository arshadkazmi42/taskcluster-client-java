package org.mozilla.taskcluster.client.queue;

/**
 * Response to a request for the queue to reply `424` (Failed Dependency)
 * with `reason` and `message` to any `GET` request for this artifact.
 *
 * See https://schemas.taskcluster.net/queue/v1/post-artifact-response.json#/oneOf[4]
 */
public class ErrorArtifactResponse {

    /**
     * Artifact storage type, in this case `error`
     *
     * Possible values:
     *     * "error"
     *
     * See https://schemas.taskcluster.net/queue/v1/post-artifact-response.json#/oneOf[4]/properties/storageType
     */
    public String storageType;
}
