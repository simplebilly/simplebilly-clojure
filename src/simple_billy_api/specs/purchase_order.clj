(ns simple-billy-api.specs.purchase-order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.purchase-order-status :refer :all]
            )
  (:import (java.io File)))


(def purchase-order-data
  {
   (ds/opt :currency) string?
   (ds/opt :deliveryAddress) any-type-spec
   (ds/opt :expectedDeliveryDate) inst?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/req :orderDate) inst?
   (ds/req :poNumber) string?
   (ds/req :status) purchase-order-status-spec
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/opt :totalGrossAmount) string?
   (ds/opt :totalNetAmount) string?
   })

(def purchase-order-spec
  (ds/spec
    {:name ::purchase-order
     :spec purchase-order-data}))
