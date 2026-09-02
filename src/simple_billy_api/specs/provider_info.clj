(ns simple-billy-api.specs.provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def provider-info-data
  {
   (ds/req :display_name) string?
   (ds/req :name) string?
   (ds/req :requires_api_key) boolean?
   (ds/req :services) (s/coll-of string?)
   (ds/req :supports_label_creation) boolean?
   (ds/req :supports_rate_estimation) boolean?
   (ds/req :supports_tracking) boolean?
   })

(def provider-info-spec
  (ds/spec
    {:name ::provider-info
     :spec provider-info-data}))
