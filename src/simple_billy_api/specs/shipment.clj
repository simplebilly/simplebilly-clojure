(ns simple-billy-api.specs.shipment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def shipment-data
  {
   (ds/opt :deliveredAt) inst?
   (ds/opt :labelUrl) string?
   (ds/opt :lineItemsShipment) any-type-spec
   (ds/req :orderId) string?
   (ds/opt :recipientAddress) any-type-spec
   (ds/req :shipmentDate) inst?
   (ds/req :shippingCarrier) string?
   (ds/opt :shippingCost) string?
   (ds/opt :shippingMethod) string?
   (ds/opt :signedBy) string?
   (ds/req :status) string?
   (ds/opt :trackingEvents) any-type-spec
   (ds/opt :trackingNumber) string?
   (ds/opt :trackingUrl) string?
   (ds/opt :weightKg) float?
   })

(def shipment-spec
  (ds/spec
    {:name ::shipment
     :spec shipment-data}))
