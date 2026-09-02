(ns simple-billy-api.specs.plan
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.plan-features :refer :all]
            [simple-billy-api.specs.plan-limits :refer :all]
            )
  (:import (java.io File)))


(def plan-data
  {
   (ds/req :features) plan-features-spec
   (ds/req :id) string?
   (ds/req :limits) plan-limits-spec
   (ds/req :name) string?
   (ds/req :priceEur) float?
   })

(def plan-spec
  (ds/spec
    {:name ::plan
     :spec plan-data}))
