(ns simple-billy-api.specs.create-subscription-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-subscription-request-data
  {
   (ds/req :event_type) string?
   (ds/opt :is_active) boolean?
   (ds/req :name) string?
   (ds/opt :secret) string?
   (ds/req :url) string?
   })

(def create-subscription-request-spec
  (ds/spec
    {:name ::create-subscription-request
     :spec create-subscription-request-data}))
