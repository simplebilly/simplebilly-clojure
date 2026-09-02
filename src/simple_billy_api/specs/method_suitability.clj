(ns simple-billy-api.specs.method-suitability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.shipping-rate :refer :all]
            )
  (:import (java.io File)))


(def method-suitability-data
  {
   (ds/req :carrier) string?
   (ds/opt :rate) shipping-rate-spec
   (ds/req :reasons) (s/coll-of string?)
   (ds/req :service) string?
   (ds/req :suitable) boolean?
   })

(def method-suitability-spec
  (ds/spec
    {:name ::method-suitability
     :spec method-suitability-data}))
