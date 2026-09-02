(ns simple-billy-api.specs.totp-enable-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def totp-enable-request-data
  {
   (ds/req :code) string?
   })

(def totp-enable-request-spec
  (ds/spec
    {:name ::totp-enable-request
     :spec totp-enable-request-data}))
