(ns simple-billy-api.specs.return-order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.return-order-status :refer :all]
            )
  (:import (java.io File)))


(def return-order-data
  {
   (ds/opt :customerContactId) string?
   (ds/opt :customerName) string?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :orderId) string?
   (ds/opt :orderNumber) string?
   (ds/req :returnNumber) string?
   (ds/opt :returnReason) string?
   (ds/req :status) return-order-status-spec
   (ds/opt :warehouseId) string?
   })

(def return-order-spec
  (ds/spec
    {:name ::return-order
     :spec return-order-data}))
