(ns simple-billy-api.specs.webhook-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.webhook-direction :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.webhook-event-status :refer :all]
            )
  (:import (java.io File)))


(def webhook-event-data
  {
   (ds/opt :attempts) int?
   (ds/opt :channel) string?
   (ds/req :direction) webhook-direction-spec
   (ds/req :eventType) string?
   (ds/opt :lastError) string?
   (ds/opt :payload) any-type-spec
   (ds/opt :status) webhook-event-status-spec
   })

(def webhook-event-spec
  (ds/spec
    {:name ::webhook-event
     :spec webhook-event-data}))
