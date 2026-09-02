(ns simple-billy-api.specs.forgot-password-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def forgot-password-request-data
  {
   (ds/req :email) string?
   })

(def forgot-password-request-spec
  (ds/spec
    {:name ::forgot-password-request
     :spec forgot-password-request-data}))
