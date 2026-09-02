(ns simple-billy-api.specs.o-auth-authorize-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def o-auth-authorize-request-data
  {
   (ds/opt :config) any-type-spec
   (ds/req :platform) string?
   (ds/req :redirect_uri) string?
   })

(def o-auth-authorize-request-spec
  (ds/spec
    {:name ::o-auth-authorize-request
     :spec o-auth-authorize-request-data}))
