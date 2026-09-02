(ns simple-billy-api.specs.rate-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.customer-info :refer :all]
            [simple-billy-api.specs.package :refer :all]
            [simple-billy-api.specs.address :refer :all]
            [simple-billy-api.specs.address :refer :all]
            )
  (:import (java.io File)))


(def rate-request-data
  {
   (ds/opt :customer) customer-info-spec
   (ds/req :packages) (s/coll-of package-spec)
   (ds/req :recipient) address-spec
   (ds/req :sender) address-spec
   })

(def rate-request-spec
  (ds/spec
    {:name ::rate-request
     :spec rate-request-data}))
