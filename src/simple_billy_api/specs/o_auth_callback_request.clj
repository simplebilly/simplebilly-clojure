(ns simple-billy-api.specs.o-auth-callback-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def o-auth-callback-request-data
  {
   (ds/req :code) string?
   (ds/opt :config) any-type-spec
   (ds/opt :connection_id) string?
   (ds/req :platform) string?
   (ds/opt :shop_domain) string?
   (ds/req :state) string?
   })

(def o-auth-callback-request-spec
  (ds/spec
    {:name ::o-auth-callback-request
     :spec o-auth-callback-request-data}))
