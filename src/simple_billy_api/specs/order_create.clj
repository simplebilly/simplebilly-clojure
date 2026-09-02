(ns simple-billy-api.specs.order-create
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


(def order-create-data
  {
   (ds/opt :auditLog) any-type-spec
   (ds/req :currency) string?
   (ds/req :customerId) string?
   (ds/opt :externalReference) string?
   (ds/opt :invoiceAddress) any-type-spec
   (ds/opt :items) any-type-spec
   (ds/opt :language) language-code-spec
   (ds/req :orderStatus) order-status-spec
   (ds/req :paymentMethod) payment-method-spec
   (ds/opt :shippingAddress) any-type-spec
   (ds/req :shippingCost) string?
   (ds/req :shippingMethod) string?
   (ds/req :shippingWeight) string?
   (ds/req :tags) (s/coll-of string?)
   (ds/req :totalCost) string?
   })

(def order-create-spec
  (ds/spec
    {:name ::order-create
     :spec order-create-data}))
