(ns simple-billy-api.specs.marketplace-webhook-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def marketplace-webhook-event-data
  {
   (ds/req :connectionId) string?
   (ds/opt :eventBody) any-type-spec
   (ds/req :eventType) string?
   (ds/opt :headers) any-type-spec
   (ds/req :platform) string?
   (ds/opt :processed) boolean?
   (ds/opt :processingError) string?
   })

(def marketplace-webhook-event-spec
  (ds/spec
    {:name ::marketplace-webhook-event
     :spec marketplace-webhook-event-data}))
