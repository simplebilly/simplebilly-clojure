(ns simple-billy-api.specs.shipping-rate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipping-rate-data
  {
   (ds/opt :breakdown) string?
   (ds/req :carrier) string?
   (ds/opt :cross_border_surcharge) string?
   (ds/req :destination_country) string?
   (ds/opt :estimated_days) int?
   (ds/req :from_api) boolean?
   (ds/opt :insured_value) string?
   (ds/opt :island_surcharge) string?
   (ds/req :origin_country) string?
   (ds/req :rate) string?
   (ds/req :service) string?
   (ds/opt :volume_discount) string?
   (ds/req :weight_kg) float?
   })

(def shipping-rate-spec
  (ds/spec
    {:name ::shipping-rate
     :spec shipping-rate-data}))
