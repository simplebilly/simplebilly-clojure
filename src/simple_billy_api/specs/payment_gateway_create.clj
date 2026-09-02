(ns simple-billy-api.specs.payment-gateway-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.gateway-type :refer :all]
            )
  (:import (java.io File)))


(def payment-gateway-create-data
  {
   (ds/req :config) any-type-spec
   (ds/req :createdAt) inst?
   (ds/opt :deletedAt) inst?
   (ds/req :enabled) boolean?
   (ds/req :gatewayType) gateway-type-spec
   (ds/req :label) string?
   (ds/opt :updatedAt) inst?
   })

(def payment-gateway-create-spec
  (ds/spec
    {:name ::payment-gateway-create
     :spec payment-gateway-create-data}))
