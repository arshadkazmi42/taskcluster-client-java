package org.mozilla.taskcluster.client.treeherderevents;

import java.util.Date;

/**
 * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items
 */
public class Log {

    /**
     * If true, indicates that the number of errors in the log was too
     * large and not all of those lines are indicated here.
     *
     * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/errorsTruncated
     */
    public boolean errorsTruncated;

    /**
     *
     * Min length: 1
     * Max length: 50
     *
     * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/name
     */
    public String name;

    public class Step {

        public class Error {

            /**
             *
             * Min length: 1
             * Max length: 255
             *
             * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/errors/items/properties/line
             */
            public String line;

            /**
             *
             * Mininum:    0
             *
             * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/errors/items/properties/linenumber
             */
            public int linenumber;
        }

        /**
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/errors
         */
        public Error[] errors;

        /**
         *
         * Mininum:    0
         *
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/lineFinished
         */
        public int lineFinished;

        /**
         *
         * Mininum:    0
         *
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/lineStarted
         */
        public int lineStarted;

        /**
         *
         * Min length: 1
         * Max length: 255
         *
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/name
         */
        public String name;

        /**
         *
         * Possible values:
         *     * "success"
         *     * "fail"
         *     * "exception"
         *     * "canceled"
         *     * "unknown"
         *
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/result
         */
        public String result;

        /**
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/timeFinished
         */
        public Date timeFinished;

        /**
         * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps/items/properties/timeStarted
         */
        public Date timeStarted;
    }

    /**
     * This object defines what is seen in the Treeherder Log Viewer.
     * These values can be submitted here, or they will be generated
     * by Treeherder's internal log parsing process from the
     * submitted log.  If this value is submitted, Treeherder will
     * consider the log already parsed and skip parsing.
     *
     * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/steps
     */
    public Step[] steps;

    /**
     *
     * Min length: 1
     * Max length: 255
     *
     * See https://schemas.taskcluster.net/treeherder/v1/pulse-job.json#/properties/logs/items/properties/url
     */
    public String url;
}
