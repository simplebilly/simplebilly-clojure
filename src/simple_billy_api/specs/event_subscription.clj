(ns simple-billy-api.specs.event-subscription
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def event-subscription-data
  {
   (ds/req :callback_url) string?
   (ds/req :event_type) string?
   (ds/req :is_active) boolean?
   (ds/req :subscription_id) string?
   })

(def event-subscription-spec
  (ds/spec
    {:name ::event-subscription
     :spec event-subscription-data}))
