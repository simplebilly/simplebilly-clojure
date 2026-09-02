(ns simple-billy-api.specs.create-connection-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-connection-request-data
  {
   (ds/opt :api_key) string?
   (ds/opt :api_secret) string?
   (ds/opt :config) any-type-spec
   (ds/req :label) string?
   (ds/req :platform) string?
   (ds/opt :shop_domain) string?
   })

(def create-connection-request-spec
  (ds/spec
    {:name ::create-connection-request
     :spec create-connection-request-data}))
