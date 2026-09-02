(ns simple-billy-api.specs.order-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.language-code :refer :all]
            [simple-billy-api.specs.order-status :refer :all]
            [simple-billy-api.specs.payment-method :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def order-update-data
  {
   (ds/opt :auditLog) any-type-spec
   (ds/opt :currency) string?
   (ds/opt :customerId) string?
   (ds/opt :externalReference) string?
   (ds/opt :invoiceAddress) any-type-spec
   (ds/opt :items) any-type-spec
   (ds/opt :language) language-code-spec
   (ds/opt :orderStatus) order-status-spec
   (ds/opt :paymentMethod) payment-method-spec
   (ds/opt :shippingAddress) any-type-spec
   (ds/opt :shippingCost) string?
   (ds/opt :shippingMethod) string?
   (ds/opt :shippingWeight) string?
   (ds/opt :tags) (s/coll-of string?)
   (ds/opt :totalCost) string?
   })

(def order-update-spec
  (ds/spec
    {:name ::order-update
     :spec order-update-data}))
