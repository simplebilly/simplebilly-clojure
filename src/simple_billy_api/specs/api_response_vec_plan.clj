(ns simple-billy-api.specs.api-response-vec-plan
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-vec-plan-data-inner :refer :all]
            )
  (:import (java.io File)))


(def api-response-vec-plan-data
  {
   (ds/opt :data) (s/coll-of api-response-vec-plan-data-inner-spec)
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-vec-plan-spec
  (ds/spec
    {:name ::api-response-vec-plan
     :spec api-response-vec-plan-data}))
