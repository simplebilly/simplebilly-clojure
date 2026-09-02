(ns simple-billy-api.specs.suitability-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.method-suitability :refer :all]
            [simple-billy-api.specs.box-fit :refer :all]
            )
  (:import (java.io File)))


(def suitability-result-data
  {
   (ds/req :methods) (s/coll-of method-suitability-spec)
   (ds/opt :recommended_box) box-fit-spec
   (ds/req :requires_insurance) boolean?
   (ds/req :total_value) string?
   (ds/req :total_weight_kg) float?
   })

(def suitability-result-spec
  (ds/spec
    {:name ::suitability-result
     :spec suitability-result-data}))
