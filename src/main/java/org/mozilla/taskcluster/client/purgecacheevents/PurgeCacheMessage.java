package org.mozilla.taskcluster.client.purgecacheevents;

/**
 * Message reporting that a specific cache should be purged
 *
 * See https://schemas.taskcluster.net/purge-cache/v1/purge-cache-message.json#
 */
public class PurgeCacheMessage {

    /**
     * Name of cache to purge. Notice that if a `workerType` have multiple kinds
     * of caches (with independent names), it should purge all caches identified
     * by `cacheName` regardless of cache type.
     *
     * See https://schemas.taskcluster.net/purge-cache/v1/purge-cache-message.json#/properties/cacheName
     */
    public String cacheName;

    /**
     * `provisionerId` under which the `workerType` we want to purge for exists.
     *
     * Syntax:     ^([a-zA-Z0-9-_]*)$
     * Min length: 1
     * Max length: 22
     *
     * See https://schemas.taskcluster.net/purge-cache/v1/purge-cache-message.json#/properties/provisionerId
     */
    public String provisionerId;

    /**
     * Message version
     *
     * Possible values:
     *     * 1
     *
     * See https://schemas.taskcluster.net/purge-cache/v1/purge-cache-message.json#/properties/version
     */
    public int version;

    /**
     * `workerType` we wish to purge cache for.
     *
     * Syntax:     ^([a-zA-Z0-9-_]*)$
     * Min length: 1
     * Max length: 22
     *
     * See https://schemas.taskcluster.net/purge-cache/v1/purge-cache-message.json#/properties/workerType
     */
    public String workerType;
}
