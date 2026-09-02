(ns simple-billy-api.specs.return-logistics-queue-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def return-logistics-queue-item-data
  {
   (ds/req :ageDays) int?
   (ds/req :createdAt) inst?
   (ds/opt :customerName) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :orderNumber) string?
   (ds/req :returnNumber) string?
   (ds/req :returnOrderId) string?
   (ds/req :status) string?
   (ds/opt :warehouseId) string?
   })

(def return-logistics-queue-item-spec
  (ds/spec
    {:name ::return-logistics-queue-item
     :spec return-logistics-queue-item-data}))
