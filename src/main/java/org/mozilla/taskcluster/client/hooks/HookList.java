package org.mozilla.taskcluster.client.hooks;

/**
 * List of hooks
 *
 * See https://schemas.taskcluster.net/hooks/v1/list-hooks-response.json#
 */
public class HookList {

    /**
     * See https://schemas.taskcluster.net/hooks/v1/list-hooks-response.json#/properties/hooks
     */
    public HookDefinition[] hooks;
}
