(ns simple-billy-api.specs.suitability-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.cart-item-input :refer :all]
            [simple-billy-api.specs.address :refer :all]
            [simple-billy-api.specs.address :refer :all]
            )
  (:import (java.io File)))


(def suitability-request-data
  {
   (ds/opt :customer_annual_volume) int?
   (ds/req :items) (s/coll-of cart-item-input-spec)
   (ds/req :recipient) address-spec
   (ds/req :sender) address-spec
   })

(def suitability-request-spec
  (ds/spec
    {:name ::suitability-request
     :spec suitability-request-data}))
