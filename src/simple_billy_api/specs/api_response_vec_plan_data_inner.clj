(ns simple-billy-api.specs.api-response-vec-plan-data-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.plan-features :refer :all]
            [simple-billy-api.specs.plan-limits :refer :all]
            )
  (:import (java.io File)))


(def api-response-vec-plan-data-inner-data
  {
   (ds/req :features) plan-features-spec
   (ds/req :id) string?
   (ds/req :limits) plan-limits-spec
   (ds/req :name) string?
   (ds/req :priceEur) float?
   })

(def api-response-vec-plan-data-inner-spec
  (ds/spec
    {:name ::api-response-vec-plan-data-inner
     :spec api-response-vec-plan-data-inner-data}))
