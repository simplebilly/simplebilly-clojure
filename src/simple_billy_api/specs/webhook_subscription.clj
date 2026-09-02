(ns simple-billy-api.specs.webhook-subscription
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def webhook-subscription-data
  {
   (ds/req :eventType) string?
   (ds/opt :isActive) boolean?
   (ds/req :name) string?
   (ds/req :secret) string?
   (ds/req :url) string?
   })

(def webhook-subscription-spec
  (ds/spec
    {:name ::webhook-subscription
     :spec webhook-subscription-data}))
