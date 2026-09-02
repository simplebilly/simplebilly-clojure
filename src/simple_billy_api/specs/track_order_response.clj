(ns simple-billy-api.specs.track-order-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.tracked-shipment :refer :all]
            )
  (:import (java.io File)))


(def track-order-response-data
  {
   (ds/req :order_number) string?
   (ds/req :order_status) string?
   (ds/req :shipments) (s/coll-of tracked-shipment-spec)
   })

(def track-order-response-spec
  (ds/spec
    {:name ::track-order-response
     :spec track-order-response-data}))
