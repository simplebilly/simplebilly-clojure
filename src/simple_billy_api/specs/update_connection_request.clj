(ns simple-billy-api.specs.update-connection-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def update-connection-request-data
  {
   (ds/opt :api_key) string?
   (ds/opt :api_secret) string?
   (ds/opt :config) any-type-spec
   (ds/opt :is_active) boolean?
   (ds/opt :label) string?
   (ds/opt :shop_domain) string?
   })

(def update-connection-request-spec
  (ds/spec
    {:name ::update-connection-request
     :spec update-connection-request-data}))
