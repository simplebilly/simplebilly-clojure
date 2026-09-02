(ns simple-billy-api.specs.update-subscription-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-subscription-request-data
  {
   (ds/opt :event_type) string?
   (ds/opt :is_active) boolean?
   (ds/opt :name) string?
   (ds/opt :secret) string?
   (ds/opt :url) string?
   })

(def update-subscription-request-spec
  (ds/spec
    {:name ::update-subscription-request
     :spec update-subscription-request-data}))
