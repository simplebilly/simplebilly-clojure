(ns simple-billy-api.specs.create-shipment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-shipment-request-data
  {
   (ds/req :carrier) string?
   (ds/opt :service) string?
   (ds/opt :weight_kg) float?
   })

(def create-shipment-request-spec
  (ds/spec
    {:name ::create-shipment-request
     :spec create-shipment-request-data}))
