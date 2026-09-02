(ns simple-billy-api.specs.payment-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.payment-method :refer :all]
            )
  (:import (java.io File)))


(def payment-create-data
  {
   (ds/opt :amount) string?
   (ds/opt :attachment) any-type-spec
   (ds/opt :currency) string?
   (ds/opt :customerId) string?
   (ds/opt :description) string?
   (ds/opt :metadata) any-type-spec
   (ds/opt :method) payment-method-spec
   (ds/opt :paymentDate) inst?
   (ds/opt :reference) string?
   })

(def payment-create-spec
  (ds/spec
    {:name ::payment-create
     :spec payment-create-data}))
