(ns simple-billy-api.specs.api-response-subscription-overview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-subscription-overview-data :refer :all]
            )
  (:import (java.io File)))


(def api-response-subscription-overview-data
  {
   (ds/opt :data) api-response-subscription-overview-data-spec
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-subscription-overview-spec
  (ds/spec
    {:name ::api-response-subscription-overview
     :spec api-response-subscription-overview-data}))
